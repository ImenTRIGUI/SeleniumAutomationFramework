# 🧪 Projet d'automatisation de tests Web – Selenium & Java


Ce projet a été réalisé dans le cadre d’une formation personnelle afin de mettre en pratique les fondamentaux de l’automatisation de tests web avec **Java**, **Selenium WebDriver** et **Maven**.  
Le site utilisé est [nopCommerce Admin Demo](https://admin-demo.nopcommerce.com/login), une plateforme e-commerce open source accessible publiquement.


## 🚀 Objectifs

- Apprendre à créer des tests automatisés avec Selenium
- Structurer un projet avec le modèle Page Object Model (POM)
- Gérer le projet avec Maven
- Utiliser Git pour le versionnement
- Découvrir les bases de l’intégration continue avec GitLab CI


## 🛠️ Technologies utilisées

- **Java 11+**
- **Selenium WebDriver**
- **Maven**
- **TestNG**
- **Git**
- **GitHub Actions**
- IDE : IntelliJ IDEA 


## 📋 Fonctionnalités testées

- Connexion avec identifiants valides
- Navigation dans les menus principaux (Catalog, Customers, Sales…)
- Recherche d’un produit dans le catalogue
- Ajout et modification de produit (nom, prix, stock…)
- Déconnexion et retour à la page de login


## 📁 Structure du projet

selenium-framework
│── src/main/java
│   ├── base
│   │   ├── BaseTest.java
│   ├── pages
│   │   ├── LoginPage.java
│   ├── utils
│   │   ├── ConfigReader.java
│   │   ├── Log.java
│── src/test/java
│   ├── tests
│   │   ├── LoginTest.java
│── testng.xml
│── log4j2.xml
│── extent-config.xml
│── pom.xml






