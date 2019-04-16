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

import com.atom.adapter.NotebookAdapter;

public class AdapterMain {
    public static void main(String[] args) {
        NotebookAdapter notebookAdapter = new NotebookAdapter();
        
        notebookAdapter.createNote("Tytul 1", "Notatka 1");
        notebookAdapter.createNote("Tytul 2", "Notatka 2", "Atom");
        
        System.out.println(notebookAdapter.notesList());
        
        notebookAdapter.removeNote("Tytul 2");
        System.out.println(notebookAdapter.getCatalog());
    }
}
