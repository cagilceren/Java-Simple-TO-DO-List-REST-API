package com.example.restservice.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QReminder is a Querydsl query type for Reminder
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReminder extends EntityPathBase<Reminder> {

    private static final long serialVersionUID = -796251787L;

    public static final QReminder reminder = new QReminder("reminder");

    public final DatePath<java.sql.Date> date = createDate("date", java.sql.Date.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath title = createString("title");

    public QReminder(String variable) {
        super(Reminder.class, forVariable(variable));
    }

    public QReminder(Path<? extends Reminder> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReminder(PathMetadata metadata) {
        super(Reminder.class, metadata);
    }

}

