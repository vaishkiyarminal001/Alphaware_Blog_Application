# Alphaware_Blog_Application

This project is a Blog REST API that allows users and administrators to manage and interact with blog-related entities, such as users, posts, categories, and comments. It provides endpoints for various operations including creating, updating, deleting, and retrieving these entities.

# Features

## User Operations

#### Sign Up: 
- New users can create their accounts by providing their email and password. Their passwords are securely stored using encryption.

#### Update Profile:
- Users can modify their profile information, including their email address and password.

#### Delete Account:
-  Users have the option to delete their accounts, which will remove their data from the platform.

#### View Posts:
 -  Users can read and view blog posts published on the platform.

#### Browse Categories: 
- Users can explore different categories under which blog posts are organized.

#### Search Posts: 
- Users can search for posts using keywords to find specific topics.

#### Leave Comments: 
- Users can interact with blog posts by leaving comments.

## Admin Operations
#### Admin Sign In: 
- Admins can access the administrative panel by logging in with their credentials.

#### Create Admin Account:
-  Existing admins can create new admin accounts for other authorized users.

#### Update Admin Profile: 
- Admins can update their own profile information, just like regular users.

#### Delete Admin Account: 
 - Admins have the ability to delete their own accounts.

#### Create Blog Posts:
 -  Admins can write and publish new blog posts to share content.

#### Edit Blog Posts:
-  Admins can edit existing blog posts to update or correct information.

#### Delete Blog Posts: 
- Admins can remove outdated or irrelevant blog posts.

#### Manage Categories: 
- Admins can create, update, and delete categories to organize content.

#### Moderate Comments: 
 - Admins can review and moderate user comments to ensure compliance with guidelines.

  ## Installation and Setup

1. Clone this repository to your local machine.
Install the required dependencies using npm install or yarn install.

2. Configure the database settings in the application.properties file.

3. Run the application using mvn spring-boot:run.


## API Documentation

The API documentation can be accessed by running the application and visiting 

http://localhost:8080/swagger-ui.html. 
This provides a user-friendly interface to interact with the API endpoints and understand their functionality.

Video :- https://drive.google.com/file/d/1YPk8_VwGlZYkKaUPb8ZuYh5Ye0_KV2mm/view?usp=sharing

## Technologies Used

- Spring Boot
- Spring Security
- JWT Authentication
- Spring Data JPA
- Swagger (API Documentation)
- MySQL (Database)
- Java Cryptography for password encryption

## Add Screenshot

![Screenshot 1](assets/1.png)
![Screenshot 2](assets/2.png)
![Screenshot 3](assets/3.png)
![Screenshot 4](assets/4.png)
