package jp.kobespiral.todo.controller;

import jp.kobespiral.todo.exception.HelloExceptionException;
import jp.kobespiral.todo.form.UserForm;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloExceptionController {
    /**
     * NullPointerExceptionを発生させる
     * Runtime Exception
     */
    @GetMapping("/occurNullPointerException")
    public String occurNullPointerException(){
        throw new NullPointerException("NullPointerExceptionが発生しました");
    }
 
    /**
     * FileNotFoundExceptionを発生させる
     * 検査例外
     * @throws FileNotFoundException
     */
    @GetMapping("/occurFileNotFoundException")
    public String occurFileNotFoundException() throws FileNotFoundException {
        throw new FileNotFoundException("FileNotFoundExceptionが発生しました");
    }
 
    /**
     * IOExceptionを発生させる
     * 検査例外
     * HelloExceptionControllerAdviceで特にキャッチしない例外
     * @throws Exception
     */
    @GetMapping("/occurOtherException")
    public String occurOtherException() throws IOException{
        throw new IOException("IOExceptionが発生しました");
    }

    /**
     * 自作例外（HelloExceptionException）を発生させる
     * @throws HelloExceptionException
     */
    @GetMapping("/helloException")
    public String HelloExceptionException(){
        throw new HelloExceptionException("HelloExceptionExceptionが発生しました");
    }


    @PostMapping("/user")
    public String addUser(@ModelAttribute("personForm") @Validated UserForm personForm, Model model) {
        //String name = personForm.getName();
        model.addAttribute("uid", personForm.getUid());
        model.addAttribute("name", personForm.getName());
        return "success";
    }

}
