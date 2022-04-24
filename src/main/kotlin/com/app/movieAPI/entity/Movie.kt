package com.app.movieAPI.entity

import com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer
import org.hibernate.annotations.CreationTimestamp
import java.util.Calendar
import javax.persistence.*
import javax.validation.constraints.NotEmpty


@Entity
@Table(name="movie")
class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id: Int? = null

    @Column(nullable = false)
    var title: @NotEmpty String? = null

    @Column(nullable = false)
    var year: @NotEmpty String? = null

    @Column(nullable = false)
    var description: @NotEmpty String? = null

    @Column(nullable = false)
    var rating: @NotEmpty String? = null

    @Column(nullable = false)
    var producedby: String? = null

    @Column(nullable = false)
    var borrowedat: Calendar? = null

    @Column(nullable = false)
    var returnedat: Calendar? = null

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true, unique = false)
    var datecreated: Calendar? = null

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true, unique = false)
    var datemodified: Calendar? = null

    constructor()

    constructor(
        title: String?,
        year: String?,
        rating: String?,
        producedby: String?,
        borrowedat: Calendar?,
        returnedat: Calendar?,
        datecreated: Calendar?,
        datemodified: Calendar?,
    ) {
        this.title = title
        this.year = year
        this.rating = rating
        this.producedby = producedby
        this.borrowedat = borrowedat
        this.returnedat = returnedat
        this.datecreated = datecreated
        this.datemodified = datemodified
    }

}
