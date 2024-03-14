## D288 - Legacy Back-End Migration: Spring Java Development

# Project Overview
This  project aims to modernize a legacy back-end system for a travel agency's vacation booking application using the Spring framework. The project involves creating a new Spring Boot project with dependencies for Spring Data JPA, Rest Repositories, MySQL Driver, and Lombok. Additionally, it includes the construction of specific packages and the implementation of various components to facilitate checkout functionality and manage vacation packages.


Project Tasks:

Creating a New Java Project with Spring Initializr: Set up a new Java project using Spring Initializr with essential dependencies.

Package Structure Creation: Construct four new packages – controllers, entities, dao, and services – for organizing code.

Configuration Setup: Set up a configuration package and integrate RestDataConfig.java and application.properties files to ensure correct package and import addresses.

Entity Class Implementation: Write code for the entities package to define entity classes and enums matching the UML diagram.

Repository Interface Creation: Implement repository interfaces in the dao package, extending JpaRepository, and incorporate cross-origin support.

Service Layer Development: Develop the services package, including classes for purchase data, purchase response, checkout service interface, and implementation.

Validation Implementation: Integrate validation to enforce required inputs for the Angular front-end.

REST Controller Development: Implement a REST controller class in the controllers package, featuring a post mapping to handle order placements.

These tasks aim to address the modernization needs of the legacy back-end system while enhancing functionality and usability. The project showcases proficiency in Java, Spring Framework, and back-end development practices.
