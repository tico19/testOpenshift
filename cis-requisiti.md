# Studenti universitari
Progetto di *Complementi di Ingegneria del Software* A.A.: 2018--2019

## Obiettivo
Scambio di appunti delle lezioni per studenti di ingegneria:

* informatica;
* gestionale.

## Requisiti di utente
Il sistema prevede tre tipi di utente:

* generico;
* iscritto;
* gestore del servizio.

### Utente generico
L'utente generico può:

* vedere il catalogo degli appunti disponibili.

Gli appunti possono essere suddivisi per:

* materie di insegnamento (utilizzando gli stessi nomi dell’offerta formativa della facoltà);
* autore (lo studente che li ha redatti);
* docente titolare dell’insegnamento al quale si riferiscono.

### Utente iscritto
L'utente iscritto può scambiare online uno o più appunti (se gli appunti sono in formato cartaceo, dovranno essere preventivamente digitalizzati).

L'utente può:

* sfogliare il catalogo appunti:
    * visualizzare per ogni file di appunti:
        * una preview parziale (per valutarne la leggibilità),
        * una scheda descrittiva,
        * una o più recensioni.
* richiedere un insieme di appunti, con:
    1. conferma esplicita del contenuto del *carrello della spesa*;
    * conferma delle generalità;
    * selezione della preferenza di consegna:
        * online, per ricevere l'URL da cui * solo il richiedente* può scaricare gli appunti;
        * offline.
* visualizzare lo stato delle richieste degli appunti.
* scrivere recenzioni a file di appunti *richiesti* (non basta la sola preview).

### Gestore del servizio
Il gestore del servizio di scambio di appunti deve:

* accedere all'elenco delle richieste per:
    * accetteare,
    * rifiutare.
* creare e aggiornare il catalogo degli appunti.

Si avvisa lo studente che ha effettuato la richiesta dell'esito mediante email.

## Requisiti minimi di sistema
Il sistema deve contenere la pagina di:

* presentazione del servizio di scambio di appunti delle lezioni, con le regole di utilizzo, da cui sia possibile accedere al catalogo degli appunti disponibili.
* carrello delle richieste di appunti.
* autenticazione al sistema (login).
* conferma della richiesta di appunti, contenente le form di sottomissione dei dati necessari all’effettuazione della richiesta e trasmissione degli appunti (per gli studenti iscritti).
* scrittura delle recensioni ad appunti (per gli studenti iscritti e che abbiano ricevuto i corrispondenti file di appunti).
* visione dello stato delle richieste di appunti (per gli studenti iscritti).
* gestione (accettazione o rifiuto) delle richieste di appunti (per il gestore del servizio).
* creazione e aggiornamento del catalogo degli appunti (per il gestore del servizio).

## Dati
Generalità dell'utente.

* nome,
* cognome,
* matricola,
* facoltà,
* email,
* nickname.