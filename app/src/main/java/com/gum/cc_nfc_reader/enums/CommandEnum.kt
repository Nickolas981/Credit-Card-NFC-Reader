package com.gum.cc_nfc_reader.enums

/**
 * Enum which define all EMV apdu
 *
 */
enum class CommandEnum
/**
 * Constructor using field
 *
 * @param cla
 * class
 * @param ins
 * instruction
 * @param p1
 * parameter 1
 * @param p2
 * parameter 2
 */
private constructor(
    /**
     * Class byte
     */
    /**
     * Method used to get the field cla
     *
     * @return the cla
     */
    val cla: Int,
    /**
     * Instruction byte
     */
    /**
     * Method used to get the field ins
     *
     * @return the ins
     */
    val ins: Int,
    /**
     * Parameter 1 byte
     */
    /**
     * Method used to get the field p1
     *
     * @return the p1
     */
    val p1: Int,
    /**
     * Parameter 2 byte
     */
    /**
     * Method used to get the field p2
     *
     * @return the p2
     */
    val p2: Int
) {

    /**
     * Select command
     */
    SELECT(0x00, 0xA4, 0x04, 0x00),

    /**
     * Read record command
     */
    READ_RECORD(0x00, 0xB2, 0x00, 0x00),

    /**
     * GPO Command
     */
    GPO(0x80, 0xA8, 0x00, 0x00),

    /**
     * GPO Command
     */
    GET_DATA(0x80, 0xCA, 0x00, 0x00)

}
