# Getting Started

## Prerequisites

- Java 21
- Node.js >= 20
- Docker & Docker Compose

## Backend

1. Copy `.env.properties.example` to `.env.properties` and fill in the required values
2. Start the dependencies: `docker compose up -d` (from `backend/app/`)
3. Run the application: `./gradlew :backend:app:bootRun`

## Frontend

1. Install dependencies: `cd frontend && npm install`
2. Build the plugin library: `npm run libs-build-all`
3. Start the dev server: `npm run start`

## Plugin development

The plugin source code is located in:
- Backend: `backend/plugin/src/`
- Frontend: `frontend/projects/plugin/src/`

For more information on how to build a plugin, see
the [Custom Plugin Definition](https://docs.valtimo.nl/features/plugins/plugins/custom-plugin-definition) documentation.
