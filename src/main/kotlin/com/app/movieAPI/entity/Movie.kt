package com.app.movieAPI.entity

import org.hibernate.annotations.CreationTimestamp
import java.util.Calendar
import javax.persistence.*
import javax.validation.constraints.NotEmpty


@Entity
@Table(name="Movie")
class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
    var producer: @NotEmpty String? = null

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true, unique = false)
    var datecreated: Calendar? = null

    constructor()
    constructor(
        title: String?,
        year: String?,
        description: String?,
        rating: String?,
        producer: String?,
    ) {
        this.title = title
        this.year = year
        this.description = description
        this.rating = rating
        this.producer = producer
    }


}
