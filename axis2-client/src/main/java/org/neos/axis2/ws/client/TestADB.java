/**micomentario*/
package org.neos.axis2.ws.client;


import java.rmi.RemoteException;

import org.neos.axis2.ws.stub.WservicesStub;

/*nueva clase*/
public class TestADB {

	public static void main(String[] args)  {
			try {
				WservicesStub stub = new WservicesStub("http://localhost:8080/axis2-webservice/services/wservices/getMessageService");
				WservicesStub.GetMessageService req = new WservicesStub.GetMessageService();
				req.setName("HUGO");
				
				WservicesStub.GetMessageServiceResponse response;
				response = stub.getMessageService(req);
				System.out.println(response.get_return());
				
			} catch (RemoteException e) {
				e.printStackTrace();
			}

	}

}
