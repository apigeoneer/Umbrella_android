package org.secfirst.umbrella.whitelabel.data.database.form

interface FormRepo {

    suspend fun removeActiveForm(activeForm: ActiveForm)

    suspend fun persistFormData(answer: Answer)

    suspend fun persistActiveForm(activeForm: ActiveForm): Boolean

    suspend fun loadModelForms(): List<Form>

    suspend fun loadAnswerBy(formId: Long): List<Answer>

    suspend fun loadActiveForms(): List<ActiveForm>

    suspend fun loadScreenBy(sh1ID : String): List<Screen>
}