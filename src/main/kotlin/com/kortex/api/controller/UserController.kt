package com.kortex.api.controller

import com.kortex.api.model.User
import com.kortex.api.repository.UserRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class UserController(private val userRepository: UserRepository) {

    @GetMapping("/users")
    fun getAllUsers(): List<User> = userRepository.findAll()

    @PostMapping("/users")
    fun createNewUser(@Valid @RequestBody user: User): User = userRepository.save(user)

    @GetMapping("/users/{id}")
    fun getUserById(@PathVariable(value = "id") userId: Long): ResponseEntity<User> {
        return userRepository.findById(userId).map { user ->
            ResponseEntity.ok(user)
        }.orElse(ResponseEntity.notFound().build())
    }

    @PutMapping("/users/{id}")
    fun updateUser(@PathVariable(value = "id") userId: Long,
                   @Valid @RequestBody newUser: User): ResponseEntity<User> {
        return userRepository.findById(userId).map { existingUser ->
            //val updatedUser : User = existingUser.copy()
            ResponseEntity.ok().body(userRepository.save(newUser))
        }.orElse(ResponseEntity.notFound().build())
    }

//    @DeleteMapping("/articles/{id}")
//    fun deleteArticleById(@PathVariable(value = "id") articleId: Long): ResponseEntity<Void> {
//
//        return articleRepository.findById(articleId).map { article ->
//            articleRepository.delete(article)
//            ResponseEntity<Void>(HttpStatus.OK)
//        }.orElse(ResponseEntity.notFound().build())
//
//    }
}