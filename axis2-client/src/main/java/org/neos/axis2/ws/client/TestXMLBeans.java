package org.neos.axis2.ws.client;


import java.rmi.RemoteException;

import org.neos.axis2.ws.service.GetMessageServiceDocument;
import org.neos.axis2.ws.service.GetMessageServiceResponseDocument;
import org.neos.axis2.ws.xmlbeans.stub.WservicesStub;




public class TestXMLBeans {

	public static void main(String[] args)  {
			try {
				WservicesStub stub = new WservicesStub("http://localhost:8080/axis2-webservice/services/wservices/getMessageService");
				GetMessageServiceDocument  reqDoc = GetMessageServiceDocument.Factory.newInstance();
				GetMessageServiceDocument.GetMessageService req = reqDoc.addNewGetMessageService();
				req.setName("HUGO");
				
				GetMessageServiceResponseDocument response = stub.getMessageService(reqDoc);
				System.out.println(response.getGetMessageServiceResponse().getReturn());
				
				
			} catch (RemoteException e) {
				e.printStackTrace();
			}

	}

}
