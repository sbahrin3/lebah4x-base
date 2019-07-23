function checkProductType(e, productId) {
	if ( e.value == '0') {
		sendAjax('addProductType','div_center','productId=' + productId);
	}
}