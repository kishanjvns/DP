package com.tech.kj.dp.proxy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image {
	private String filePath;
	private byte[] content;
	public Image() {
		//default one
	}
	public Image(String filePath) {
		super();
		this.filePath = filePath;		
		loadImage();
	}
	
	public void loadImage() {
		Path path=Paths.get(filePath);
		try {
			content=Files.readAllBytes(path);
			System.out.println("image size length "+content.length);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public int getContentLength() {
		if(content==null)
			return 0;
		return content.length;
	}
	
	public void displayContent() {
		JFrame jf=new JFrame();
		jf.setSize(400, 400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon=new ImageIcon(content);
		JLabel jLabel=new JLabel(icon);
		jLabel.setBounds(10, 10, 400, 400);
		jLabel.setVisible(true);
		jf.add(jLabel);
	}
	
}
