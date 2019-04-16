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
public class Note {
    private String title;
    private String note;
    private String recipient;
    
    public Note(String title, String note, String recipient)
    {
        this.title = title;
        this.note = note;
        this.recipient = recipient;
    }

    
    public String getTitle() {
        return title;
    }

    public String getNote() {
        return note;
    }
    
    
}
