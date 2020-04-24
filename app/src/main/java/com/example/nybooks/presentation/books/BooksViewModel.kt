package com.example.nybooks.presentation.books

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nybooks.data.model.Book

class BooksViewModel : ViewModel() {

    val booksLivrData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks(){
        booksLivrData.value = createFakeBooks()
    }

    fun createFakeBooks(): List<Book> {
        return listOf(
            Book("O poder do hábito", "Gary taubes"),
            Book("Por que engordamos?", "Gary taubes"),
            Book("A arte de ligar o foda-se", "Manson")
        )
    }

}