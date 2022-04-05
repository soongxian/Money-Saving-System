function (event) {
        var amount = parseFloat($('#amount').val()).toFixed(2);

        //console.log(price_to_2_decimals);
        $('#amount').val(amount);

    } // if( document.querySelector('#add-edit-form').checkValidity() ) 


function submit_successful() {
    alert('Transaction recorded successfully');
}
;

function today_date() {
    document.getElementById('date_calendar').value = new Date().toDateInputValue();
}