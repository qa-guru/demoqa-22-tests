package examples;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class CssXpathExamples2 {

    void cssXpathExamples() {

//        <textarea jsname="yZiJbe" class="gLFyf" jsaction="paste:puy29d;" id="APjFqb" maxlength="2048" name="q" rows="1"
//        aria-activedescendant="" aria-autocomplete="both" aria-controls="Alh6id" aria-expanded="false" aria-haspopup="both"
//        aria-owns="Alh6id" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox"
//        spellcheck="false" title="Поиск" type="search" value="" aria-label="Найти"
//        data-ved="0ahUKEwj7prfm1ZuBAxXZ_bsIHY2rCscQ39UDCAQ" style=""></textarea>

//        <textarea name="q" title="Поиск" type="search" aria-label="Найти"></textarea>
//        <textarea name="q"></textarea>

        $("[name=q]");
        $("textarea[name=q]"); // css-selector
        $x("//textarea[@name='q']"); // xpath-selector
        $(xpath("//textarea[@name='q']")); // xpath-selector
        $(byName("q"));


        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]");
        $(by("data-testid", "email"));
        $x("//*[@data-testid='email']");

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $("[id=email]");
        $("#email");
        $(id("email"));

        // <input type="email" class="inputtext login_form_input_box" name="email">
        $("[name=email]");
        $(byName("email"));

        // <input type="email" class="inputtext login_form_input_box">
        $("[class=login_form_input_box]");
        $(".login_form_input_box");
        $(".inputtext.login_form_input_box");
        $("input.inputtext.login_form_input_box");
        $x("//input[@class='inputtext'][@class='login_form_input_box']");

        // <div class="inputtext">
        //      <input type="email" class="login_form_input_box">
        // </div>
        $(".inputtext .login_form_input_box");
        $(".inputtext").$(".login_form_input_box");
        $("div.inputtext input.login_form_input_box");
        $("div.inputtext").$("input.login_form_input_box");

        // <div>Hello, qa.guru!</div>
        $(byText("Hello, qa.guru!"));
        $(withText("lo, qa.gu"));
        $x("//*[contains(text(),'Hello, qa.guru!')]");
        $x("//*[text()='Hello, qa.guru!']"); // wrong

    }
}
