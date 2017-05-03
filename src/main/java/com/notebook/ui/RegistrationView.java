package com.notebook.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import javax.annotation.PostConstruct;

/**
 * Created by monju on 01-May-17.
 */
@SpringView(name=RegistrationView.VIEW_NAME)
public class RegistrationView extends VerticalLayout implements View {

    public static final String VIEW_NAME="registration";

    @PostConstruct
    void init(){
        addComponent(new Label("This is the registration view"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

    }
}
