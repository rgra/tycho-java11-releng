package pxml;

import javax.xml.bind.DataBindingException;

public class RequiresXML {

	public static void main(String[] args) {
		new DataBindingException("test", new RuntimeException("test"));
	}

}
