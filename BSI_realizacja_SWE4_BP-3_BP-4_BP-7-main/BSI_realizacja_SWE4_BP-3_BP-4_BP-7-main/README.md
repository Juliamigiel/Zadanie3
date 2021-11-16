# BSI_realizacja_SWE4_BP-3_BP-4_BP-7 by Anastasiia Ponkratova, Julia Migiel
## Raport z testowania modułów
Zgodnie z raportem pokrycia testowego wygenerowanym przez narzędzie JUnit, pokrycie wynosi 95%, ponieważ jedyna klasa main nie zawiera żadnych zmiennych ani metod. Pełna statystyka jest przedstawiona w poniższym raporcie:

![alt text](https://github.com/s20488/BSI_realizacja_SWE4_BP-3_BP-4_BP-7/blob/main/test_coverage.png?raw=true)

#### test_should_check_if_data_is_properly_filtered()
        Test sprawdza, czy dane są poprawnie filtrowane według przedziałów wieku, dochodu i płci oraz 
        porównuje wyniki z bieżącą stroną i jej wielkością
        
        setAgeFrom - ustawia początkowy zakres wieku
        setAgeTo - ustawia ostateczny zakres wieku
        setIncomeFrom - ustawia początkowy zakres dochodu 
        setPage - ustawia numer i rozmiar strony
        getSelectedGenders - ustawianie płci
        getCurrentPage - ustawia aktualną stronę
        getPages - uzyskuje numer i rozmiar strony
        getItems - pobieranie zawartości listy
        assertThat - konstrukt sprawdzający założenia dotyczące wartości dowolnych danych
        
#### test_should_check_if_paging_works()
        Test sprawdza działanie listy stron i jej aktualny stan pod względem wielkości i zawartości oraz 
        porównuje wielkość strony z listą
        
        setPage - pobieranie nazwy i rozmiaru strony
        getItems - pobieranie zawartości listy

#### test_should_check_if_search_by_name_works()
        Test sprawdza działanie wyszukiwania po nazwie zestawu i porównuje, zgodnie z
        mechanizmem asercji, z listą

        setName - ustawia nazwę parametru
        getItems - pobieranie zawartości listy

#### test_should_check_if_search_by_age_works()
        Test sprawdza, czy wyszukiwanie w przedziale wiekowym działa i porównuje wynik z listą

        setAgeFrom - ustawia początkowy zakres wieku
        setAgeTo - ustawia docelowy przedział wiekowy
        getItems - pobieranie zawartości listy

#### test_should_check_if_search_by_gender_works()
        Test sprawdza, czy wyszukiwanie działa według płci, w tym przypadku żeńskiej, i 
        porównuje wynik z listą

        getItems - pobieranie zawartości listy
        getSelectedGenders - ustawianie płci

#### test_should_check_if_search_by_income_works()
        Test sprawdza, czy wyszukiwanie dochodów działa w określonym zakresie i 
        porównuje wynik z listą

        setIncomeFrom - ustawia początkowy zakres dochodu 
        setIncomeTo - ustawia ostateczny zakres dochodu
        getItems - pobieranie zawartości listy

**Kod został wzięty od**: Tokiya
