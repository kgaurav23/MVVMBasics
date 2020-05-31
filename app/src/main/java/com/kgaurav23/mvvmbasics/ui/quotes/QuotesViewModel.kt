package com.kgaurav23.mvvmbasics.ui.quotes

import androidx.lifecycle.ViewModel
import com.kgaurav23.mvvmbasics.data.Quote
import com.kgaurav23.mvvmbasics.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}