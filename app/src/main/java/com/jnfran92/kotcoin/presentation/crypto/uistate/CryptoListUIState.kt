package com.jnfran92.kotcoin.presentation.crypto.uistate

import com.jnfran92.kotcoin.presentation.crypto.model.UICrypto

sealed class CryptoListUIState{

    object ShowDefaultView: CryptoListUIState()

    object ShowLoadingView: CryptoListUIState()

    object ShowErrorRetryView: CryptoListUIState()

    class ShowDataView(val data: List<UICrypto>): CryptoListUIState()

    class ShowMessageView(val message: String): CryptoListUIState()
}
