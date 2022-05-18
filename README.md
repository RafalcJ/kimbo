# Tech
Java 11, h2 Database, Spring Data

# Zalozenia
- projekt jest springowa aplikacja oparta na bazie danych h2. 
- napisany zostal z naruszeniem wielu zasad clean code.
- posiada mozliwosc tworzenia oraz pobrania parkingow.


# Zadanie
Sciagnij repozytorium i popraw istniejace bledy z zachowaniem zasad clean code, REST, oraz javy 8+.
Popraw zadanie tak aby program mial funkcje: 
- dodawania parkingów
- dodawania komentarzy(jeden parking moze miec nieskonczona ilosc komentarzy)
- pobierania komentarzy stronami(paginacja) posortowanych od najnowszego do najstarszego. API powinno dostarczac mozliwosc sterowania iloscia komentarzy na jedna strone ale nie powinno pozwalac na pobieranie wiecej niz 20komentarzy za jednym razem
- dodaj odpowiednie zaleznosci(jesli trzeba/preferujesz) i napisz test do metody, ktora przetestuje pobieranie komentarze z punktu powyzszego


# PS
- zadanie powinno zajac Ci maksymalnie godzine. Jesli zajmie Ci wiecej czasu, napisz w komentarzu jakie punkty jeszcze proponujesz poprawic/dodac.
- mozesz wykonac zadanie uzywajac preferowanych przez siebie bibliotek.
- gotowe zadanie prześlij na github lub w formacie zip na maila rekrutera

# Materialy pomocnicze
Json tworzenia parkingu 
```
{
    "name": "Parking TIR",
    "lat": "50.756470",
    "lng": "17.433797",
    "address": {
        "country": "PL",
        "street": "A4",
        "postalCode": "22-222"
    }
}
```

