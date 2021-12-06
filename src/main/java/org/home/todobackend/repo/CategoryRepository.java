package org.home.todobackend.repo;

import org.home.todobackend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Можно сразу использовать все методы CRUD (Create, Read, Update, Delete)
// принцип ООП: абстракция-реализация - здесь описываем все доступные способы доступа к данным
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
