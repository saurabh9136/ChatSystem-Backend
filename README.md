# ChatSystem Backend

This repository contains the backend code for a ChatSystem application, built using Java. The ChatSystem enables real-time messaging
between users, providing a seamless communication experience.

## Features

- User authentication: Users can register and log in to access the ChatSystem.
- Real-time messaging: Users can send and receive messages in real-time, enabling instant communication.
- Group chat: Users can create or join existing chat groups to engage in group conversations.
- Message history: The application stores chat message history, allowing users to view past conversations.
- User presence: Users can see the online status of other users, indicating their availability for communication.
- Notifications: The application provides notifications for new messages and group activity.

## Technologies Used

The backend of the ChatSystem is developed using the following technologies:

- Java: The core programming language used for the backend development.
- Spring Boot: A Java framework that simplifies the development of web applications.
- WebSocket: A communication protocol that enables real-time bidirectional communication between clients and servers.
- Hibernate: An Object-Relational Mapping (ORM) library for Java, used for database operations.
- MongoDB: A relational database management system used to store and retrieve data.

## Prerequisites

To run the ChatSystem backend locally, you need to have the following prerequisites installed on your machine:

- Java Development Kit (JDK) 8 or higher
- MongoDB Database Server
- An Integrated Development Environment (IDE) such as Eclipse or IntelliJ IDEA

## Getting Started

To get started with the ChatSystem backend, follow these steps:

1. Clone this repository to your local machine using the following command:
   ```
   git clone https://github.com/saurabh9136/ChatSystem-Backend.git
   ```

2. Open the project in your preferred IDE.

3. Set up the MongoDB database by executing the SQL scripts provided in the `database` folder.

4. Configure the database connection settings in the `application.properties` file.

5. Build and run the application.

6. The backend server should now be up and running on the specified port, ready to handle API requests from the ChatSystem frontend.

For detailed instructions on running the application, refer to the documentation provided within the project.

## Contributing

Contributions to the ChatSystem backend are welcome. If you find any bugs, have suggestions for improvements, or would like to add new features, please feel free to submit a pull request or open an issue on the repository.


## Contact

If you have any questions or need further assistance, please don't hesitate to contact the repository owner.

Thank you for your interest in the ChatSystem backend. We hope you find this project useful and informative.
