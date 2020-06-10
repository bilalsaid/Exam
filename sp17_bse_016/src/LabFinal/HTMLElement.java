package LabFinal;

public class HTMLElement extends HTMLTag {

	String tagName;
	String startTag;
	String endTag;
	String tagBody;
	
	
	HTMLElement(String tag) 
	{
		tagName = tag;
	}
	
	@Override
	public String getTagName() 
	{
		return tagName;
	}

	@Override
	public void setStartTag(String tag) 
	{
		startTag = tag;
	}

	@Override
	public void setEndTag(String tag) 
	{
		endTag = tag;
	}
	@Override
	public void setTagBody(String tag) 
	{
		tagBody = tag;
	}

	@Override
	public void generateHtml() 
	{
		System.out.println(startTag + " " + tagBody + " " + endTag);
	}
}
