/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.adapter;

/**
 *
 * @author tomek
 */
public class NotebookAdapter implements I_Notebook, I_Notebook_v2
{
    Notebook_v2 notebook = new Notebook_v2();
    
    @Override
    public void createNote(String title, String note) {
        notebook.createNote(title, note, null);
        
    }

    @Override
    public String getNote(String title) {
        return notebook.getNote(title);
    }

    @Override
    public String removeNote(String title) {
        return notebook.removeNote(title);
    }

    @Override
    public String getCatalog() {
        return notebook.notesList();
    }

    @Override
    public void createNote(String title, String note, String recipient) {
        notebook.createNote(title, note, recipient);
        
    }

    @Override
    public String notesList() {
        return notebook.notesList();
    }
    
}
