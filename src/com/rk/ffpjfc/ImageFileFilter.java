package com.rk.ffpjfc;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class ImageFileFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        String file = f.getName().toUpperCase();

        if (file.endsWith(".JPG") ||
                file.endsWith(".GIF") ||
                file.endsWith(".PNG") ||
                file.endsWith(".BMP")) {
            return true;
        }

        return false;
    }

    @Override
    public String getDescription() {
        return "Image File";
    }
}
