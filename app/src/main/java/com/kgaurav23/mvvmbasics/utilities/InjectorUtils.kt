package com.kgaurav23.mvvmbasics.utilities

import com.kgaurav23.mvvmbasics.data.FakeDatabase
import com.kgaurav23.mvvmbasics.data.FakeQuoteDao
import com.kgaurav23.mvvmbasics.data.QuoteRepository
import com.kgaurav23.mvvmbasics.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}