# Getting Started

## Prerequisites

- Java 21
- Node.js >= 20
- Docker & Docker Compose

## Running the application

All commands below should be run from the **project root** directory.

### 1. Configure environment

Copy `.env.properties.example` to `.env.properties` and fill in the required values.

### 2. Start Docker dependencies

Make sure Docker is running, then start the required services:

```shell
./gradlew :backend:app:composeUp
```

### 3. Start the backend

```shell
./gradlew :backend:app:bootRun
```

### 4. Start the frontend

```shell
cd frontend
npm install
npm run libs-build-all
npm start
```

### Keycloak users

The application has a few test users that are preconfigured.

| Name         | Role           | Username  | Password  |
|--------------|----------------|-----------|-----------|
| James Vance  | ROLE_USER      | user      | user      |
| Asha Miller  | ROLE_ADMIN     | admin     | admin     |
| Morgan Finch | ROLE_DEVELOPER | developer | developer |

## Plugin development

The plugin source code is located in:
- Backend: `backend/plugin/src/`
- Frontend: `frontend/projects/plugin/src/`

For more information on how to build a plugin, see
the [Custom Plugin Definition](https://docs.valtimo.nl/features/plugins/plugins/custom-plugin-definition) documentation.
