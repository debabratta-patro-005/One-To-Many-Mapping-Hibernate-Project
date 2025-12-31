📘 One-To-Many Mapping Hibernate Project

One-To-Many Mapping Hibernate Project is a simple Java application that demonstrates how to implement a One-to-Many relationship using Hibernate ORM and Maven. It allows inserting or adding data into a database where a parent entity is mapped to multiple child entities.

This repository is created using Maven, and uses Hibernate for object-relational mapping in a standalone Java application. 
GitHub

🧾 Table of Contents

About the Project

Key Features

Technologies Used

Prerequisites

Installation & Setup

Configuration

Running the Application

Project Structure

Entity Relationship

Contributing

License

📌 About the Project

In a relational database, a One-to-Many relationship means one record in a parent table can be associated with multiple records in a child table — for example, one department can have many employees. Hibernate makes it easy to model and persist this kind of relationship in Java using annotations such as @OneToMany and @ManyToOne. 
GeeksforGeeks

This project demonstrates exactly that: how to configure and persist parent and child entities using Hibernate.

⭐ Key Features

✔ Demonstrates a proper One-to-Many mapping using Hibernate
✔ Uses annotations for entity mapping
✔ Configures Hibernate via hibernate.cfg.xml
✔ Supports CRUD operations on parent and child entities
✔ Built with Maven for dependency management

🛠 Technologies Used
Technology	Purpose
Java	Core programming language
Hibernate ORM	Object-relational mapping
Maven	Build tool & dependency management
JDBC / Database	Data storage (e.g., MySQL, PostgreSQL, H2, etc.)
Annotations	Entity mapping definitions
📥 Prerequisites

Before you get started, make sure you have:

✔ JDK 8+ installed
✔ Maven installed
✔ A database installed (e.g., MySQL / PostgreSQL)
✔ JDBC driver for your database added to the project

📦 Installation & Setup

Clone the repository:

git clone https://github.com/debabratta-patro-005/One-To-Many-Mapping-Hibernate-Project.git


Import the project into your favorite Java IDE (Eclipse / IntelliJ IDEA / VS Code) as a Maven project.

Hibernate and related dependencies will be downloaded automatically via Maven.

⚙ Configuration

Before running, configure your database connection in hibernate.cfg.xml. Update:

<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/your_db</property>
<property name="hibernate.connection.username">your_username</property>
<property name="hibernate.connection.password">your_password</property>
<property name="hibernate.dialect">org.hibernate.dialect.MySQL5Dialect</property>


Replace your_db, your_username, and your_password with your actual database name and credentials.

Make sure the database exists before running the application.

▶ Running the Application

You can run the application in one of the following ways:

From your IDE

Locate the main class containing public static void main(String[] args)

Run it as a Java application

Using Maven in the terminal

mvn compile
mvn exec:java


Depending on how the main class is configured in the pom.xml, Maven may need the exec plugin configured.

🗂 Project Structure

Here’s how the project is organized:

One-To-Many-Mapping-Hibernate-Project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── model/          # Parent & child entity classes
│   │   │   ├── dao/            # Data access operations
│   │   │   └── App.java        # Application entry point
│   │   └── resources/
│   │       └── hibernate.cfg.xml
├── pom.xml                    # Maven project file
├── .gitignore
└── README.md


Actual package names may vary depending on how the code is structured in the repository.

🔗 Entity Relationship

In this project, you will see how a parent entity relates to a collection of child entities via a One-to-Many association using Hibernate annotations like:

@OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)

@ManyToOne in the child entity

This kind of mapping tells Hibernate how objects relate to each other — and how these relations are stored in the database with the correct foreign key constraints. 
javaguides.net

🤝 Contributing

Contributions are welcome! Here’s how you can help:

Improve the entity model

Add CRUD functionality

Write tests

Improve documentation

Add more examples or tutorial steps

Feel free to open an issue or submit a pull request.
