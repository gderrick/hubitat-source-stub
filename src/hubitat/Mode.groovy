package hubitat

// https://docs.hubitat.com/index.php?title=Mode_Object
// https://docs.smartthings.com/en/latest/ref-docs/mode-ref.html
abstract class Mode {

    // ? From https://docs.smartthings.com/en/latest/ref-docs/mode-ref.html#getid
    abstract String getId()

    // ? From https://docs.smartthings.com/en/latest/ref-docs/mode-ref.html#getname
    abstract String getName()
}
