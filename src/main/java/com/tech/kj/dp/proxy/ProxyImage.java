package com.tech.kj.dp.proxy;

public class ProxyImage extends Image{
	private String filePath;
	private Image proxiedImage;
	public ProxyImage(String filePath) {
		this.filePath=filePath;
	}
	@Override
	public void displayContent() {
		proxiedImage=new Image(filePath);
		proxiedImage.displayContent();
	}

}
