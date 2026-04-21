/*
 * Copyright 2015-2023 Ritense BV, the Netherlands.
 *
 * Licensed under EUPL, Version 1.2 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://joinup.ec.europa.eu/collection/eupl/eupl-text-eupl-12
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

val auth0JavaJwtVersion: String by project
val httpclient5Version: String by project
val httpcoreVersion: String by project
val jacksonVersion: String by project
val jsonPathVersion: String by project
val junitJupiterVersion: String by project
val kotlinLoggingVersion: String by project
val mockitoKotlinVersion: String by project
val okhttpVersion: String by project

dockerCompose {
    setProjectName("kvk-handelsregister")
    isRequiredBy(project.tasks.integrationTesting)
    tasks.integrationTesting {
        useComposeFiles.addAll("$rootDir/docker-resources/docker-compose-base-test.yml", "docker-compose-override.yml")
    }
}


dependencies {
    implementation("com.ritense.valtimo:contract")
    implementation("com.ritense.valtimo:core")
    implementation("com.ritense.valtimo:plugin-valtimo")
    implementation("com.ritense.valtimo:value-resolver")
    implementation("com.ritense.valtimo:case")

    implementation("org.springframework.boot:spring-boot-starter-webflux")

    implementation("io.github.oshai:kotlin-logging-jvm:$kotlinLoggingVersion")
    implementation("com.fasterxml.jackson.core:jackson-databind")
    implementation("com.fasterxml.jackson.core:jackson-annotations")
    implementation("com.fasterxml.jackson.core:jackson-core")

    // Apache deps
    implementation("org.apache.httpcomponents.client5:httpclient5:$httpclient5Version")
    implementation("org.apache.httpcomponents:httpcore:$httpcoreVersion")

    implementation("com.auth0:java-jwt:$auth0JavaJwtVersion")

    // Testing
    testImplementation("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
    testImplementation("com.fasterxml.jackson.core:jackson-annotations:$jacksonVersion")
    testImplementation("com.fasterxml.jackson.core:jackson-core:$jacksonVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-migrationsupport:$junitJupiterVersion")
    testImplementation("org.assertj:assertj-core")
    testImplementation("org.mockito:mockito-core")
    testImplementation("org.hamcrest:hamcrest-library")
    testImplementation("com.jayway.jsonpath:json-path:$jsonPathVersion")
    testImplementation("org.mockito.kotlin:mockito-kotlin:$mockitoKotlinVersion")

    testImplementation("com.squareup.okhttp3:mockwebserver:$okhttpVersion")
    testImplementation("com.squareup.okhttp3:okhttp:$okhttpVersion")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

}

apply(from = "gradle/publishing.gradle")
