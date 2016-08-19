package com.cloudwick.training.core.xml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomProcessing {
	private static Document doc;
	private static List<PersonXML> list = new ArrayList<>();
	
	public static void main(String[] args){
		parse("person.xml");
	}
	private static void parse(String filename){
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dom = factory.newDocumentBuilder();
			doc = dom.parse(filename);
            FetchData();
            PrintData();
		} catch (SAXException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void FetchData(){
		//Fetch rows
		Element rootEl = doc.getDocumentElement();
		//get person list
		NodeList personlist = rootEl.getElementsByTagName("Person");
		for(int i=0; i < personlist.getLength(); i++){
			//Fetch person node
			Node person = personlist.item(i);
			Element personEl = (Element) person;
			
			//Fetch PersonId
			int pid = Integer.parseInt(personEl.getAttribute("personid"));
			
			//Fetch Person name
			NodeList namelist = personEl.getElementsByTagName("name");
			Node name = namelist.item(0);
			Element nameEl = (Element) name;
			String nameval = nameEl.getFirstChild().getNodeName();
			
			//Fetch Person name
			NodeList agelist = personEl.getElementsByTagName("age");
			Node age = agelist.item(0);
			Element ageEl = (Element) age;
			String ageval = ageEl.getFirstChild().getNodeName();
			
			PersonXML obj = new PersonXML();
			obj.setName(nameval);
			obj.setAge(ageval);
			obj.setPersonid(pid);
			
			list.add(obj);
		}
	}
	private static void PrintData(){
        for(PersonXML p : list){
            System.out.println("Pid : "+ p.getPersonid());
            System.out.println("Name : "+ p.getName());
            System.out.println("Age : "+ p.getAge());
        }
	}
}
