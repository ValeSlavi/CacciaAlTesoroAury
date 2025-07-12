# Caccia al Tesoro Aury

Web app realizzata con Spring Boot per una caccia al tesoro personalizzata, pensata per dispositivi mobile e ottimizzata per un'esperienza moderna e divertente.

## Funzionalità principali
- **Login personalizzato** con sessione utente e redirect.
- **Sfide tematiche** con feedback visivo e gestione errori.
- **Gestione indizi**: pagine dedicate con immagini, messaggi e indizi.
- **Pagina Papera Random**: mostra un'immagine casuale di papera, con stile mobile first.
- **Pagina Papera Indizio**: mostra sempre la papera duck12.jpg con indizio speciale.
- **Database H2** per la gestione degli utenti.
- **Frontend responsive** con palette lilla/violetto e CSS dedicati.

## Struttura del progetto
```
├── src/
│   ├── main/
│   │   ├── java/com/aurorina/tesoro/controller/   # Controller Spring Boot
│   │   ├── java/com/aurorina/tesoro/entity/       # Entity JPA
│   │   ├── java/com/aurorina/tesoro/repo/         # Repository
│   │   ├── java/com/aurorina/tesoro/service/      # Service
│   │   ├── resources/templates/                   # Template HTML Thymeleaf
│   │   ├── resources/static/css/                  # File CSS
│   │   ├── resources/static/img/                  # Immagini
│   │   ├── resources/application.properties       # Configurazione
│   ├── test/
│   │   ├── java/com/aurorina/tesoro/              # Test
├── pom.xml                                        # Dipendenze Maven
```

## Avvio del progetto
1. Clona la repository:
   ```
   git clone https://github.com/ValeSlavi/CacciaAlTesoroAury.git
   ```
2. Entra nella cartella del progetto:
   ```
   cd CacciaAlTesoroAury
   ```
3. Avvia l'applicazione Spring Boot:
   ```
   ./mvnw spring-boot:run
   ```
   Oppure su Windows:
   ```
   mvnw.cmd spring-boot:run
   ```
4. Accedi all'app da browser su [http://localhost:8080](http://localhost:8080)

## Personalizzazione
- Modifica le immagini in `src/main/resources/static/img/` per cambiare le papere o aggiungere nuovi indizi.
- Personalizza i testi e le sfide nei template HTML in `src/main/resources/templates/`.
- Cambia la palette e lo stile modificando i file CSS in `src/main/resources/static/css/`.

## Autore
- Progetto creato da Valentina per una caccia al tesoro speciale!

## Licenza
Questo progetto è ad uso personale e didattico.
