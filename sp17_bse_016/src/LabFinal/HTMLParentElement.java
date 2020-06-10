package LabFinal;

import java.util.ArrayList;


public class HTMLParentElement extends HTMLTag{
	private String tagName;
	private String startTag;
	private String endTag;
	private ArrayList<HTMLTag> children = new ArrayList<HTMLTag>();
	
	HTMLParentElement(String tag)
	{
		tagName = tag;
	}

	public String getTagName()
	{
		return tagName;
	}


	public void setStartTag(String tag)
	{
		this.startTag = tag;
	}

	public void setEndTag(String tag)
	{
		this.endTag = tag;
	}
	
	public void addChildTag(HTMLTag tag)
	{
		children.add(tag);
	}
	
	public void removeChildTag(HTMLTag tag)
	{
		children.remove(tag);
	}
	
	public ArrayList<HTMLTag> getChildren()
	{
		return children;
	}

	@Override
	public void generateHtml() 
	{
		System.out.println(startTag);
		for (HTMLTag htmlTag : children) 
		{
			htmlTag.generateHtml();
		}
		System.out.println(endTag);
	}
	
}
