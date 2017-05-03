package com.notebook.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import javax.annotation.PostConstruct;

/**
 * Created by monju on 01-May-17.
 */
@SpringView(name=DefaultView.VIEW_NAME)
public class DefaultView extends VerticalLayout implements View{
    public static final String VIEW_NAME="default";

    @PostConstruct
    void init(){
        addComponent(new Label("This is the main view"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

    }
}
