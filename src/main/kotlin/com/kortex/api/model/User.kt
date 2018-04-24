package com.kortex.api.model

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

/**
 * A data class automatically generates equals(), hashcode(), toString() and copy() methods.
 */

@Entity
data class User(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id : Long  = 0,
        @GeneratedValue(strategy = GenerationType.AUTO)
        var uniqueID : Long = 0,
        @get : NotBlank
        var name : String = "",
        @get : NotBlank
        var firstLastName : String ="",
        @get : NotBlank
        val secondLastName : String ="",
        @get : NotBlank
        val age : Int = 0,
        @get: NotBlank
        val date : LocalDate = LocalDate.now(),
        @get: NotBlank
        val status : Int = 1,
        @get : NotBlank
        val image : String = "",
        @get : NotBlank
        val rating : Float = 0.0f,
        @get : NotBlank
        val phone1 : String = "",
        @get : NotBlank
        val phone2 : String ="",
        @get : NotBlank
        val nationality : String ="Mexican",
        @get : NotBlank
        val description: String = "Not previous description",
        @get : NotBlank
        val dob : String ="16/05/1991"

)