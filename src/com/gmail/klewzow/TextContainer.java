package com.gmail.klewzow;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@ToFileSave
public class TextContainer {

	private String str;
	public TextContainer(String str) {
		super();
		this.str = str;
	}

	@Save
	public void saver(File file) {
		fileIsset(file);
		try (FileWriter fis = new FileWriter(file, true)) {
			fis.write(this.str + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void fileIsset(File file) {
		if (!file.isFile()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {
		return "TextContainer [str=" + str + "]";
	}

}
