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
public interface I_Notebook_v2 {
    void createNote(String title, String note, String recipient);

	String getNote(String title);

	String removeNote(String title);

	String notesList();
}
