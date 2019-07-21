package com.imamachi.awsdemo;

import com.imamachi.awsdemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.net.ContentHandler;

@Component
public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private BookRepository bookRepository;

    @Autowired
    public InitialDataLoader(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event){

    }
}
