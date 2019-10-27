import java.io.*;

import javax.xml.parsers.DocumentBuilderFactory;

import java.xml

public class LecturaXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		Document documento=null;
		try {
		DocumentBuilder builder=factory.newDocumentBuilder();
		documento=builder.parse(new File(empleado.xml));
		}
		catch (Exception e){ }
		
				
				
			public static void addNode(String URI) {//es el fichero xml
				
				DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
				
				try {
					
					DocumentBuilder builder=factory.newDocumentBuilder();
					Document documento=builder.parse(new File(URI));
					documento=getDocumentElement().normalize();
					//crea la caracteristica nova
					Element empleado=doucument.createElement("edad");
					Text valor=document.createTexNode("33");
					//metemos
					document.getDocumentElement().getElementsByTagName("empleado").item(0).
					appendChild(empleado).appendChild
				}
				catch (Exception e){ }
				
			}	
				

	}

}
