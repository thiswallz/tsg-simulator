# TSG Simulator Architecture and Features

## Introduction

TSG Simulator is a cutting-edge platform designed for creating, testing, and simulating a wide range of scenarios and workflows. It offers a rich set of features and a robust architecture to meet diverse training and simulation needs.


GitOps Repository: [https://github.com/thiswallz/tsg-simulator-deployment](https://github.com/thiswallz/tsg-simulator-deployment)

## Architecture

- **Container Orchestration:** TSG Simulator runs on Kubernetes, providing scalability, high availability, and easy deployment.

- **GitOps Approach:** Utilizes ArgoCD for continuous delivery and GitOps principles to manage configurations.

- **Microservices:** Powered by Spring Boot modules, the platform is built using microservices architecture to ensure modularity and flexibility.

- **Frontend:** Developed with Next.js and React, capable of handling middleware complexities, including WebSocket support.

- **Database:** PostgreSQL is used for data storage and retrieval, ensuring data consistency and reliability.

- **Dockerized:** The entire platform is containerized, making it easy to deploy and manage components.

- **Helm Charts:** Provides Helm charts for umbrella deployments, simplifying installation and configuration.

- **Azure Cloud:** Hosted on Microsoft Azure, offering robust cloud infrastructure and services.

- **Monitoring:** Utilizes Grafana for comprehensive monitoring and observability.

- **Caching Layer:** Redis is employed as a caching layer to optimize performance and reduce database load.

- **Authentication:** Keycloak OpenID Connect (OIDC) ensures secure and customizable authentication.

- **Swagger/OpenAPI:** Offers a standardized API documentation for easy integration and usage.

- **Internationalization (i18n):** Supports multiple languages for a global user base.

- **Progressive Web App (PWA):** Users can install the platform as a PWA for a seamless experience.

- **CMS Admin Platform:** A dedicated CMS admin platform for creating and managing teams, workflows, results, and more.

- **UI:** Features an intuitive user interface where users can explore a library of digital simulators.

- **AI Integration:** Integrates artificial intelligence for enhanced simulations and interactions.

- **Document Upload:** Users can upload documents to workflows to provide hints and answer user questions.

- **App Ecosystem:** Consists of system apps, official apps, and custom apps with specific properties and limits.

- **Customization:** Highly customizable and white-labeling options available, including theming.

- **Reporting:** Robust reporting features to track invitations, results, team member progress, completions, trainings, tests, and game careers.

## Licensing

TSG Simulator is open-source software. It can be used locally for non-commercial purposes. Commercial usage requires licensing from the platform administrators.

## Conclusion

TSG Simulator is a powerful and versatile platform designed to address a wide range of training and simulation needs. Its modular architecture, comprehensive feature set, and scalability make it a valuable tool for organizations and individuals seeking effective training and workflow simulation solutions.
