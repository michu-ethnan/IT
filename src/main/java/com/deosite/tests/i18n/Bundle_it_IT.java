package com.deosite.tests.i18n;

import com.deosite.tests.model.account.NewAddressForm;
import com.deosite.tests.model.login.LoginForm;
import com.deosite.tests.model.login.DifferentLoginForm;
import com.deosite.tests.model.order.Personal;
import com.deosite.tests.model.order.Company;
import com.deosite.tests.model.order.WithoutEmailAddress;
import com.deosite.tests.model.register.RegisterForm;

import java.util.ListResourceBundle;

public class Bundle_it_IT extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                // Labels
                {"capacity (l) label", "pojemność (l)"},
                {"capacity (ml) label", "pojemność (ml)"},

                // Products
                {"mug", "Mug"},


                {"configurable product", "kubek palette"},

                // Number of products in the cart
                {"greater", "Il tuo carrello (2)"},
                {"smaller", "Il tuo carrello (1)"},

                // Categories

                //Headers
                {"account header", "Account"},
                {"Ogród header", "Giardino "},
                {"Jadalnia header", "Arti della tavola "},
                {"Kuchnia header", "Cucina "},
                {"Łazienka i garderoba header", "Manutenzione della casa "},
                {"Dekoracje header", "Decorazioni "},
                {"Świat dziecka header", "Mondo del bambino "},
                {"Nowości header", "Novità "},
                {"Wyprzedaż header", "Saldi "},
                {"Marki header", "Marche"},



                // Alerts
                {"added to cart", "Il prodotto è stato aggiunto al carrello"},
                {"address saved", "Dirección guardada"},
                {"address deleted", "Address deleted"},

                // Messages
                {"success order message", "Dziękujemy, Twoje zamówienie zostało złożone!"},
                {"additional success info", "Zamówienie jest kompletowane, o wysyłce poinformujemy drogą mailową."},
                {"the cart is empty message", "Nessun prodotto nel carrelloNessun prodotto nel carrello"},
                {"login button text", "Accesso"},
                // Objects
                {"person", new Personal(
                        "test@test.pl",
                        "Test",
                        "Test-Test",
                        "Testowa 1",
                        "Testowo",
                        "11-111",
                        "123456789"

                )},
                {"personFromPortugal", new Personal(
                        "test@test.pl",
                        "Test",
                        "Test-Test",
                        "Testowa 1",
                        "Testowo",
                        "11-111",
                        "123456789"
                )},
                {"personFromIreland", new Personal(
                        "test@test.pl",
                        "Test",
                        "Test-Test",
                        "Testowa 1",
                        "Testowo",
                        "11-111",
                        "123456789"
                )},
                {"company", new Company(
                        "test@test.pl",
                        "Test",
                        "Test-Test",
                        "Testowa 1",
                        "Testowo",
                        "11-111",
                        "123456789",
                        "Testowa sp. z o.o",
                        "1234567891"

                )},
                {"withoutEmailAddress", new WithoutEmailAddress(
                        "Test",
                        "Test-Test",
                        "Testowa 1",
                        "Testowo",
                        "11-111",
                        "123456789"
                )},
                {"login", new LoginForm(
                        "tester-email-tester@yandex.com",
                        "Test12345!"
                )},
                {"login to order_1", new LoginForm(
                        "abisimeon22@yandex.com",
                        "Test12345!"
                )},
                {"login to order_2", new LoginForm(
                        "abisimeon222@yandex.com",
                        "Test12345!"
                )},
                {"login to order_3", new LoginForm(
                        "abisimeon223@yandex.com",
                        "Test12345!"
                )},
                {"login to see order", new LoginForm(
                        "tekasimeon00@gmail.com",
                        "Test12345!"
                )},
                {"differentEmail", new DifferentLoginForm(
                        "abisimeon223@yandex.com",
                        "Test12345!"
                )
                },
                {"newAddress", new NewAddressForm(
                        "Salomea",
                        "Kowalska",
                        "Testowa 1",
                        "Testowo",
                        "00-000",
                        "0000000000"
                )},
                {"register", new RegisterForm(
                        "Test12345!",
                        "Test",
                        "Test-Test"
                )}
        };
    }
}
