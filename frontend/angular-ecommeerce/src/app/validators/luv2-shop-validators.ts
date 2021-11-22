import { FormControl, ValidationErrors } from "@angular/forms";

export class Luv2ShopValidators {

    // whitespace validation
    static notOnlyWhitespace(control: FormControl): ValidationErrors {

        // check if string only contains whitespace
        if ((control.value != null) && (control.value.trim().length === 0)) {
            // invalid, retunr error object
            return { 'notOnlyWhitespace': true }
            // Validation error key. The HTML template will check for this error key

        } else {
            // valid, return null
            return null;
        }
    }
}
