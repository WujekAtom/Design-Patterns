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

import java.util.*;
import com.atom.adapter.Note;

public class Notebook implements I_Notebook
{
    private ArrayList<Note> noteList = new ArrayList<>();

    @Override
    public void createNote(String title, String note) {
        noteList.add(new Note(title, note));
    }

    @Override
    public String getNote(String title) {
        for (int i = 0; i<noteList.size(); i++)
            if (noteList.get(i).getTitle().equals(title))
                return noteList.get(i).getNote();
        return null;
    }

    @Override
    public String removeNote(String title) {
        for (int i = 0; i < noteList.size(); i++)
            if (noteList.get(i).getTitle().equals(title))
            {
                String note = noteList.get(i).getNote();
                noteList.remove(i);
                return note;
            }
        return null;
    }

    @Override
    public String getCatalog() {
        StringBuffer catalog = new StringBuffer();
		
		for (int i = 0; i < noteList.size(); i++)
		{
			catalog.append("- " + noteList.get(i).getTitle() + "\n");
		}
		
		return catalog.toString();
    }
    
}
