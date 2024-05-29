
# Todo List Management Tool

This is a Spring Boot application for managing a Todo list. It provides RESTful APIs to create, read, update, and delete (CRUD) todo items. The application uses MongoDB as its database.

## Features

- Create a new Todo item
- Retrieve all Todo items
- Retrieve a specific Todo item by ID
- Update a Todo item
- Delete a Todo item

## Technologies Used

- Java
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or later
- Maven 3.6.0 or later
- MongoDB 4.0 or later

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/todo-list.git
   cd todo-list
   ```

2. **Set up MongoDB:**

   Make sure MongoDB is running on your local machine. By default, the application expects MongoDB to be available at `mongodb://localhost:27017/todolist`.

3. **Configure MongoDB connection:**

   If your MongoDB instance is running on a different host or port, update the `src/main/resources/application.properties` file with the correct MongoDB URI.

   ```properties
   spring.data.mongodb.uri=mongodb://your-mongodb-uri/todolist
   ```

4. **Build and run the application:**

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

   The application will start on `http://localhost:8080`.

### API Endpoints

- **Get all todos:**

  ```http
  GET /api/todos
  ```

- **Get a todo by ID:**

  ```http
  GET /api/todos/{id}
  ```

- **Create a new todo:**

  ```http
  POST /api/todos
  ```

  **Request body:**

  ```json
  {
    "title": "Todo title",
    "description": "Todo description",
    "completed": false
  }
  ```

- **Update a todo:**

  ```http
  PUT /api/todos/{id}
  ```

  **Request body:**

  ```json
  {
    "title": "Updated title",
    "description": "Updated description",
    "completed": true
  }
  ```

- **Delete a todo:**

  ```http
  DELETE /api/todos/{id}
  ```

- **get number of todos:**

  ```http
  GET /api/todos/count
  ```
## Project Structure

```plaintext
todo-list
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── todolist
│   │   │               ├── controller
│   │   │               ├── model
│   │   │               ├── repository
│   │   │               └── service
│   │   └── resources
│   │       ├── application.properties
├── pom.xml
```

- **model**: Contains the `Todo` model class.
- **repository**: Contains the `TodoRepository` interface for CRUD operations.
- **service**: Contains the `TodoService` class that encapsulates the business logic.
- **controller**: Contains the `TodoController` class that handles HTTP requests.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.


## Contact

For any questions or suggestions, please contact [kyrillos.isaac2@gmail.com].
