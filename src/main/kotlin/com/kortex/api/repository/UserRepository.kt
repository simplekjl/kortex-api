package com.kortex.api.repository

import com.kortex.api.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Since we’ve extended ArticleRepository from JpaRepository interface, all the CRUD methods on Article entity
 * is readily available to us.
 * Spring boot automatically plugs-in a default implementation of
 * JpaRepository called SimpleJpaRepository at runtime.
 */
@Repository
interface UserRepository : JpaRepository<User,Long>