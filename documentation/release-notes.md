# Release notes

Overzicht van wijzigingen per versie van de KVK Handelsregister-plugin.

## 1.2.0
De API-sleutel wordt nu als geheim behandeld: hij wordt niet meer teruggegeven aan de beheerschermen en niet meer meegenomen bij het exporteren van de configuratie.
**Let op:** bij bestaande configuraties is het veld na het bijwerken leeg. Vul de API-sleutel opnieuw in en sla de configuratie op, anders werkt de koppeling met het Handelsregister niet meer.

## 1.1.0
In het voorbeeldproces gaat de keuze na het opzoeken nu op het resultaat van de KvK-zoekopdracht in plaats van op het ingevoerde KvK-nummer, zodat het proces de juiste kant op gaat wanneer een nummer geen bedrijf oplevert.

## 1.0.3
Ondergebracht in een eigen repository met voorbeeldapplicatie en aparte documentatie. Namespace gewijzigd naar `valtimoplugins`.

## 1.0.2
Versie verhoogd om dubbele publicaties te voorkomen.

## 1.0.0
Eerste publieke release: bedrijfsgegevens ophalen uit het KVK Handelsregister.
