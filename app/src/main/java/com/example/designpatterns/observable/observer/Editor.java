package com.example.designpatterns.observable.observer;

import java.io.File;

public class Editor {

    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile()  {
        try {
            if (this.file != null) {
                events.notify("save", file);
            } else {
                throw new Exception("Please open a file first.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
