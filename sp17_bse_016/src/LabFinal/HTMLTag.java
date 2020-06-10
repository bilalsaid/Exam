package LabFinal;

import java.util.List;

public abstract class HTMLTag {
	
	HTMLTag(){
		
	}
	
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	
	public void setTagBody(String tag) 
	{
		
	}
	
	public void addChildTag(HTMLTag tag) 
	{
		
	}
	
	public void removeChildTag(HTMLTag tag)
	{
		
	}
	
	public List<HTMLTag> getChildren(){
		return null;
		
	}
	
	public abstract void generateHtml();
}
